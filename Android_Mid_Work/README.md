# NotePad
这是一个建议的笔记本APP

## 我作的工作是，在原有的APP中实现了
	1.添加笔记时间
	2.笔记搜索
	3.UI美化
	4.更换背景

### 1.在笔记中添加了笔记修改时间的功能。
	基本原理：
		1.在NotePad中新添加一条COLUMN_NAME_MODIFICATION_DATE 属性
![1](https://github.com/499549060/Android/blob/master/Android_Mid_Work/1.1.png)

		2.修改notelist_item布局，添加额外的一个Textview 并用垂直的线性布局
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/1.2.png)

		3.分别在NoteEditor和NotePadProvider中将新创建或修改的笔记记录，并将其存入COLUMN_NAME_MODIFICATION_DATE属性中
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/1.3.png)

		4.在Noteslist中，将新的notelist_item加载值SimpleCursorAdapter中
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/1.4.png)

	截图：
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/1.png)

### 2.在笔记中添加了笔记搜索功能。
	基本原理：
		1.先添加一个原生搜索按钮至界面中，在list_option_menu.xml中添加即可
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.1.png)

		2.在Notelist中将该按钮添加至onOptionsitemSeleted方法中
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.2.png)

		3.写好一个用于搜索的activity，新建一个note_search_list,将SearchView跟ListView相结合，动态地显示搜索结果
			要动态地显示搜索结果，就要对SearchView文本变化设置监听，NoteSearch除了要继承ListView外还要实现SearchView.OnQueryTextListener接口：
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.3.1.png)

![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.3.2.png)

		4.在AndroidManifest.xml注册NoteSearch
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.4.png)

	截图：
![](https://github.com/499549060/Android/blob/master/Android_Mid_Work/2.png)

### 3.UI美化
	改变后如下图：<br>
![](https://github.com/CR7563/Android/blob/master/NotePad/assets/time.png)

### 4.更换背景
![](https://github.com/CR7563/Android/blob/master/NotePad/assets/choicecolor.png)
![](https://github.com/CR7563/Android/blob/master/NotePad/assets/background.png)
