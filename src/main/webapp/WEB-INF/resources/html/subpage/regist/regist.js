$(document).ready(function() {
	// 监听注册必填项的丢失焦点事件,若用户输入有误则红框显示
	$('.register-item').keyup(function() {
		// 当监听到的文本框是“密码”或者“确认密码”时
		if ($(this).attr("id") == "password" || $(this).attr("id") == "makeSurePassword") {
			
			// 确保密码文本符合格式且相同
			var bool = (document.getElementById("password").text == document.getElementById("makeSurePassword").text);
			
			if(bool&&this.checkValidity()){
				$("#password").removeClass("textError");
				$("#makeSurePassword").removeClass("textError");
			}else{
				$("#password").addClass("textError");
				$("#makeSurePassword").addClass("textError");
			}
			
		}else{
			// 除密码外的文本框只要符合正则表达式就可以了
			if (this.checkValidity()) {
				$(this).removeClass("textError");
			} else {
				$(this).addClass("textError");
			}
		}
	});
});