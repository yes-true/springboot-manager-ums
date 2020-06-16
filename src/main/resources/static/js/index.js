// index文件
/* 隐藏菜单 */
$(function(){
			// 基本隐藏
			// $("#openNav").hide();
			// $("#foldNav").click(function(){
			// 	$("#navHide").hide();
			// 	$("#foldNav").hide();
			// 	$("#openNav").show();
			// 	return false;
			// })
			
			// $("#openNav").click(function(){
			// 	$("#navHide").show();
			// 	$("#openNav").hide();
			// 	$("#foldNav").show();
			// 	return false;
			// })
			// return false;
			
			//hide调用时间方法隐藏
			//暂时不能使用
			// $("#openNav").hide()
			// $("#foldNav").click(function(){
			// 	// $("#navHide").animate({"left":"-180px"},1000).hide(1000);
			// 	// $("#navHide").addClass('animated fadeOutLeft');
			// 	 $("#navHide").hide(function(){
			// 	   $("#foldNav").hide();
			// 		$("#openNav").show();
			// 	})
			// 	return false;
			// })
			
			$("#openNav").hide()
			$("#foldNav").click(function(){
				// $("#navHide").animate({"left":"-180px"},3000)
				 $("#navHide").hide(1000,function(){
				 $("#loginDiv").addClass('animated fadeOutLeft');
				   $("#foldNav").hide();
					$("#openNav").show();
				})
				return false;
			})
			$("#openNav").click(function(){
				// $("#navHide").animate({"left":"-180px"},3000)
				 $("#navHide").show(1000,function(){
				  $("#openNav").hide();
				 $("#foldNav").show();
				})
				return false;
			})
			
			
			
			
			
			
			
		})