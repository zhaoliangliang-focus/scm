//
function setTime() {
	var dt = new Date();
	var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
	var strWeek = arr_week[dt.getDay()];
	var strHour = dt.getHours();
	var strMinutes = dt.getMinutes();
	var strSeconds = dt.getSeconds();
	if (strMinutes < 10)
		strMinutes = "0" + strMinutes;
	if (strSeconds < 10)
		strSeconds = "0" + strSeconds;
	var strYear = dt.getFullYear() + "年";
	var strMonth = (dt.getMonth() + 1) + "月";
	var strDay = dt.getDate() + "日";
	var strTime = strHour + ":" + strMinutes + ":" + strSeconds;
	time.innerHTML = strYear + strMonth + strDay + " " + strTime + "  "
			+ strWeek;
}
//
function ajaxTest() {
	if (confirm("确定需要退出吗？")) {
		$.ajax({
			type : "POST",
			url : "safeLogout",
			dataType : "json",
			error : function() {
				alert("退出失败");
			},
			success : function(responseInfo) {
				//
				if (responseInfo.status == 0) {
					window.location.replace("index");
				}
				//
				if (responseInfo.status == 1) {
					alert("退出失败");
				}
			}
		});// end ajax
	}// end if confirm
}