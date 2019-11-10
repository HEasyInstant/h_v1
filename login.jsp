<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta http-equiv="cache-control" content="max-age=604800;private"/>
    <meta charset="utf-8"/>
    <title>HEasyInstant | Login</title>

    <meta name="description" content="User login page"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    
	<link rel="icon"       href="${pageContext.request.contextPath}/resources/dist/img/heasyinstant5.png" type="image/png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources//css/toastr.min.css">
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/admin/assets/css/ace-part2.css"/>
    <![endif]-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/aes.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/scripts/slogin.js" type="text/javascript"></script>
    <script src='${pageContext.request.contextPath}/resources/js/jquery.min.js'></script>
    <script src="${pageContext.request.contextPath}/resources/js/toastr.min.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function () {
            SIGNfnc.init();
            toastr.options = {
				"closeButton": true,
				"debug": false,
				"newestOnTop": false,
				"progressBar": false,
				"positionClass": "toast-bottom-right",
				"preventDuplicates": false,
				"onclick": null,
				"showDuration": "300",
				"hideDuration": "1000",
				"timeOut": "5000",
				"extendedTimeOut": "1000",
				"showEasing": "swing",
				"hideEasing": "linear",
				"showMethod": "fadeIn",
				"hideMethod": "fadeOut"
			};
			//Initialize to hide caps-lock-warning
			$('.caps-lock-warning').hide();

			//Sniff for Caps-Lock state
			$("#login-password").keypress(function(e) {
				var s = String.fromCharCode( e.which );
				if((s.toUpperCase() === s && s.toLowerCase() !== s && !e.shiftKey)||
					(s.toUpperCase() !== s && s.toLowerCase() === s && e.shiftKey)) {
					this.caps = true; // Enables to do something on Caps-Lock keypress
					$(this).next('.caps-lock-warning').show();
				} else if((s.toLowerCase() === s && s.toUpperCase() !== s && !e.shiftKey)||
					  (s.toLowerCase() !== s && s.toUpperCase() === s && e.shiftKey)) {
					this.caps = false; // Enables to do something on Caps-Lock keypress
					$(this).next('.caps-lock-warning').hide();
				}//else else do nothing if not a letter we can use to differentiate
			});

			//Toggle warning message on Caps-Lock toggle (with some limitation)
			$(document).keydown(function(e){
				if(e.which==20){ // Caps-Lock keypress
				var pass = document.getElementById("login-password");
				if(typeof(pass.caps) === 'boolean'){
					//State has been set to a known value by keypress
					pass.caps = !pass.caps;
					$(pass).next('.caps-lock-warning').toggle(pass.caps);
				}
				}
			});

			//Disable on window lost focus (because we loose track of state)
			$(window).blur(function(e){
				// If window is inactive, we have no control on the caps lock toggling
				// so better to re-set state
				var pass = document.getElementById("password");
				if(typeof(pass.caps) === 'boolean'){
					pass.caps = null;
					$(pass).next('.caps-lock-warning').hide();
				}
			});
        });
        (function () {
            var bgCounter = 0,
                    backgrounds = ["${pageContext.request.contextPath}/resources/css/images/pic.jpg", "${pageContext.request.contextPath}/resources/css/images/couple-travel.jpg", "${pageContext.request.contextPath}/resources/css/images/pic1.jpg"];

            function changeBackground() {
                bgCounter = (bgCounter + 1) % backgrounds.length;
                $('body').css({
                    'background': 'url(' + backgrounds[bgCounter] + ') no-repeat',
                    'background-size': 'cover',
                    'z-index': 0,
                    'width': 'auto',
                    'height': 'auto',
                    'overflow-y': 'hidden',
                    'overflow-x': 'hidden'
                });

                setTimeout(changeBackground, 10000);
            }

            changeBackground();

        })();
        $(document).keypress(function (e) {
            if (e.which == 13) {
                $('#btn-login').trigger('click');
            }
        });
    </script>


    <style>
        /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
        @import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);
        /*@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);*/

        body {
            margin: 0;
            padding: 0;
            border: 0;
            outline: 0;
            background: #fff;
            color: #fff;
            font-family: Arial;
            font-size: 12px;
            background-image: url("${pageContext.request.contextPath}/resources/css/images/couple-travel.jpg");
            background-size: cover;
            overflow-y: hidden;
            overflow-x: hidden;
        }

        .body {
            position: absolute;
            top: -20px;
            left: -20px;
            right: -40px;
            bottom: -40px;
            width: auto;
            height: auto;
            z-index: 0;
            overflow-y: hidden;
            overflow-x: hidden;
        }

        .grad {
            position: absolute;
            top: -20px;
            left: -20px;
            right: -40px;
            bottom: -40px;
            width: auto;
            height: auto;
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(0, 0, 0, 0)), color-stop(100%, rgba(0, 0, 0, 0.65))); /* Chrome,Safari4+ */
            z-index: 1;
            opacity: 0.7;
        }

        .header {
            position: absolute;
            top: calc(50% - 35px);
            left: calc(50% - 255px);
            z-index: 2;
        }

        .header div {
            float: left;
            color: #fff;
            font-family: 'Exo', sans-serif;
            font-size: 35px;
            font-weight: 200;
        }

        .header div span {
            color: #5379fa !important;
        }

        .login {
            position: absolute;
            top: calc(50% - 75px);
            left: calc(50% - 50px);
            height: 150px;
            width: 350px;
            padding: 10px;
            z-index: 2;
        }

        .login input[type=text] {
            width: 250px;
            height: 30px;
            background: transparent;
            border: 1px solid rgba(255, 255, 255, 0.6);
            border-radius: 2px;
            color: #fff;
            font-family: 'Exo', sans-serif;
            font-size: 16px;
            font-weight: 400;
            padding: 4px;
        }

        .login input[type=password] {
            width: 250px;
            height: 30px;
            background: transparent;
            border: 1px solid rgba(255, 255, 255, 0.6);
            border-radius: 2px;
            color: #fff;
            font-family: 'Exo', sans-serif;
            font-size: 16px;
            font-weight: 400;
            padding: 4px;
            margin-top: 10px;
        }

        .login input[type=button] {
            width: 260px;
            height: 35px;
            background: #fff;
            border: 1px solid #fff;
            cursor: pointer;
            border-radius: 2px;
            color: #a18d6c;
            font-family: 'Exo', sans-serif;
            font-size: 16px;
            font-weight: 400;
            padding: 6px;
            margin-top: 10px;
        }

        .login input[type=button]:hover {
            opacity: 0.8;
        }

        .login input[type=button]:active {
            opacity: 0.6;
        }

        .login input[type=text]:focus {
            outline: none;
            border: 1px solid rgba(255, 255, 255, 0.9);
        }

        .login input[type=password]:focus {
            outline: none;
            border: 1px solid rgba(255, 255, 255, 0.9);
        }

        .login input[type=button]:focus {
            outline: none;
        }

        ::-webkit-input-placeholder {
            color: rgba(255, 255, 255, 0.6);
        }

        ::-moz-input-placeholder {
            color: rgba(255, 255, 255, 0.6);
        }
    </style>
</head>
<body>
<div class="body"></div>
<div class="grad"></div>
<div class="header">
    <div> Login</div>
</div>
<br>
<input type="hidden" id="baseurl" value="/"/>
<div class="login" id="login_heasyInstant">
    <input type="text" placeholder="username" name="username" id="login-username" required="required"><br>
    <input type="password" placeholder="password" id="login-password" name="password" required="required">
	<span class="caps-lock-warning" title="Caps lock is on!"><br>
	<font style="color: white;font-weight: bold;font-size: 15px;font-weight: 600;">Caps Lock is on</font></span><br>
    <input type="button" id="btn-login" value="Login"><br>
	<p style="margin-left:40%;margin-top:3px">
		<a href="${pageContext.request.contextPath}/resources/email-resetPassword.html">
		<font style="color: white;font-size: 15px;font-weight: 600;">Forgot Password</font>
		</a>
	</p>
</div>
	
</body>
</html>
