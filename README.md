Android-Binding with Android Annotations support
===========================

I modified Android-Binding to support Android annotations. In A-A Views are constructed automatically with @EActivity annotations. 

I wanted to be able to reuse the already-created view in the @AfterViews method. In order to do that I added Binder.inflateViewFromExistingView() method.

``` 
public InflateResult inflateViewFromExistingView(Context context,  View view, int layoutId);

where:
view - is the created view to reuse
layoutId - is the resource xml definition of the view (e.g.  R.layout.activity_init)
```

## Sample usage

```
@AfterViews
protected void afterViews() {
	Binder.InflateResult inflateResult = Binder.inflateViewFromExistingView(this, findViewById(R.id.drawer_layout), R.layout.activity_init);
	Binder.bindView(this, inflateResult, mViewModel);
}
```

Spinner support in Android-Binding
===========================
I added Android Spinner support with SpinnerViewProvider.

ViewModel:

```
public IObservableCollection<String> testList = new ArrayListObservable<String>(
          String.class,
          new String[] {new String("Element 1"), new String("Element 2")}
);
```

View:

```
<Spinner android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/testListSpinner"
        binding:entries="testList" />
```


fork author: Bartosz Kosarzycki

AndroidBinding
==============

MVVM for Android

## What's New

* Pre Compiled version available on root directory
* android-binding.gen.zip for activity/application template code generation

## Quick start

* Download android-binding-version.jar and place under lib of your project
* Unzip android-binding.gen.zip to root directory of your project
* run the wizard.xml to generate application and activity codes

## Markup Demo

* Under Demo/MarkupDemoICS folder
* The best way to start learning the framework! 