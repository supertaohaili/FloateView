# 一个简单的浮窗工具

原项目：https://github.com/liuguangli/FloatUtil
感谢原作者，这是一个简单的浮窗工具。封装了浮窗的使用方法，并做了系统、版本的兼容处理，帮你绕过权限的限制。
本项目主要是修改一些细节，适应自己的项目，主体代码是原项目，再次感谢原作者！！！！！！

# 效果图

 <img src="https://github.com/supertaohaili/FloateView/blob/master/float_param.gif" width="300">

apk下载链接
<a href="https://github.com/supertaohaili/FloateView/blob/master//floateutil1.0.1_2018-01-22.apk">https://github.com/supertaohaili/FloateView/blob/master/floateutil1.0.1_2018-01-22.apk</a>


# 使用
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}

dependencies {
      compile 'com.github.supertaohaili:FloateView:1.0.0'
}

混淆
-keep class com.thl.floate.** { *; }
-dontwarn com.thl.floate.**
```


示例代码:
``` java
1、创建一个简单的浮窗
      SimpleView floatView = new SimpleView(this);  //SimpleView 是你自定义的 View
      FloatUtil.showFloatView(floatView, null);

   关闭浮窗
   FloatUtil.hideFloatView(context, SimpleView.class, false);

2、 向浮窗传递参数
    SimpleViewWitchParam floatView = new SimpleViewWitchParam(this);
    Bundle bundle = new Bundle();
    bundle.putString(SimpleViewWitchParam.PARAM, "我是传过来的参数");
    FloatUtil.showFloatView(floatView, bundle);

3、指定层级和对齐方式
   SimpleViewWitchParam floatView = new SimpleViewWitchParam(this);
   FloatUtil.showFloatView(floatView, Gravity.CENTER,WindowManager.LayoutParams.TYPE_TOAST , null);

4、智能浮窗（突破授权）
   SimpleViewWitchParam floatView = new SimpleViewWitchParam(this);
   Bundle bundle = new Bundle();
   bundle.putString(SimpleViewWitchParam.PARAM, "智能浮窗");
        // 指定浮窗显示的位置
   Point point = new Point();
   point.x = 0;
   point.y = 0;
   FloatUtil.showSmartFloat(floatView, Gravity.CENTER, point, bundle);


```


### Known Issues
If you have any questions/queries/Bugs/Hugs please mail @
taohailili@gmail.com