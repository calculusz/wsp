if ($.fn.pagination){
	$.fn.pagination.defaults.beforePageText = '缁楋拷';
	$.fn.pagination.defaults.afterPageText = '閸忕湧pages}闂嬶拷';
	$.fn.pagination.defaults.displayMsg = '妞ゎ垳銇歿from}閸掔殫to},閸忕湧total}鐟锋﹢瀵�';
}
if ($.fn.datagrid){
	$.fn.datagrid.defaults.loadMsg = '濮濓絽婀搹鏇犳倞閿涘矁鐝涚粙宥呯窡閵嗗倶锟介妴锟�';
}
if ($.messager){
	$.messager.defaults.ok = '绾板搫鐣�';
	$.messager.defaults.cancel = '閸欐牗绉�';
}
if ($.fn.validatebox){
	$.fn.validatebox.defaults.missingMessage = '鐟尪鍑犻崗銉╃垺閻愬搫绻�潛鎼佺垺';
	$.fn.validatebox.defaults.rules.email.message = '鐠滃鍑犻崗銉︽箒閺佸牏娈戦梿璇茬摍闁吀娆㈤崷鏉挎絻';
	$.fn.validatebox.defaults.rules.url.message = '鐠滃鍑犻崗銉︽箒閺佸牏娈慤RL閸︽澘娼�';
	$.fn.validatebox.defaults.rules.length.message = '鏉撶鍙嗛崗褍顔愰梹宄板韫囧懘鐖ゆ禒瀣煠{0}閸滃瘚1}娑斿鏋�';
}
if ($.fn.numberbox){
	$.fn.numberbox.defaults.missingMessage = '鐟尪鍑犻崗銉╃垺閻愬搫绻�潛鎼佺垺';
}
if ($.fn.combobox){
	$.fn.combobox.defaults.missingMessage = '鐟尪鍑犻崗銉╃垺閻愬搫绻�潛鎼佺垺';
}
if ($.fn.combotree){
	$.fn.combotree.defaults.missingMessage = '鐟尪鍑犻崗銉╃垺閻愬搫绻�潛鎼佺垺';
}
if ($.fn.calendar){
	$.fn.calendar.defaults.weeks = ['閺冿拷','娑擄拷','娴滐拷','娑擄拷','閸ワ拷','娴滐拷','閸忥拷'];
	$.fn.calendar.defaults.months = ['娑擄拷婀�','娴滃本婀�','娑撳婀�','閸ユ稒婀�','娴滄梹婀�','閸忣厽婀�','娑撳啯婀�','閸忣偅婀�','娑旀繃婀�','閸椾焦婀�','閸椾椒绔撮張锟�','閸椾椒绨╅張锟'];
}
if ($.fn.datebox){
	$.fn.datebox.defaults.currentText = '娴犲﹤銇�';
	$.fn.datebox.defaults.closeText = '闂傛粓鏋�';
	$.fn.datebox.defaults.okText = '绾板搫鐣�';
	$.fn.datebox.defaults.missingMessage = '鐟尪鍑犻崗銉╃垺閻愬搫绻�潛鎼佺垺';
}
if ($.fn.datetimebox && $.fn.datebox){
	$.extend($.fn.datetimebox.defaults,{
		currentText: $.fn.datebox.defaults.currentText,
		closeText: $.fn.datebox.defaults.closeText,
		okText: $.fn.datebox.defaults.okText,
		missingMessage: $.fn.datebox.defaults.missingMessage
	});
}
