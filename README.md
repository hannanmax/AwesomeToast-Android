
# AwesomeToast

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-11%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Developed By](https://img.shields.io/badge/Android%20Arsenal-@Hannan_Max-red.svg?style=flat)](https://www.instagram.com/hannan_max/)

Make your native android toast look beautiful.

## Preview
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/success.gif)
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/warning.gif)
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/error.gif)
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/info.gif)
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/default.gif)
![gif](https://github.com/yadav-rahul/TastyToast/blob/lib/static/confusion.gif)

## About

Refer Here [Wiki](https://github.com/yadav-rahul/TastyToast/wiki)

Grab the above demo app from here :

[![Get it on Google Play](https://play.google.com/intl/en_us/badges/images/badge_new.png)](https://play.google.com/store/apps/details?id=com.demo.tastytoast)

## Dependency

Add it in your root build.gradle at the end of repositories
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }	
	}
}
```

Add dependency in your app module

```
dependencies {
	implementation 'com.github.HM-hack-and-tech:AwesomeToast-Android:1.0'
}
```

## Usage

### Java
```
AwesomeToast.makeText(getApplicationContext(), "Hannan Max here...", AwesomeToast.LENGTH_LONG, AwesomeToast.WARNING);
```
Last parameter here is the type of toast you want to show.

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/HM-hack-and-tech/AwesomeToast-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2019 Hannan Max

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
"# Android-AwesomeToast" 
