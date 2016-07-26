PulseView
===================

Widget that generates pulsation relative to your icons.

[![DevLight](https://lh4.googleusercontent.com/-9btnRFp_eVo/V5cfwZsBpMI/AAAAAAAAC4E/s4NGoezKhpAVdVofAoez1QWpzK5Na8_cQCL0B/w147-h20-no/devlight-badge.png)](http://devlight.com.ua)

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-PulseView-yellow.svg?style=flat)](http://android-arsenal.com/details/1/3537)
![Android](https://img.shields.io/badge/platform-android-brightgreen.svg?style=flat&label=Platform)
[![Download](https://api.bintray.com/packages/gigamole/maven/pulseview/images/download.svg)](https://bintray.com/gigamole/maven/pulseview/_latestVersion)
[![Crates.io](https://img.shields.io/crates/l/rustc-serialize.svg?maxAge=2592000&label=License)](https://github.com/DevLight-Mobile-Agency/NavigationTabStrip/blob/master/LICENSE.txt)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/14759a0ad2f34908a888ece61731bd2a)](https://www.codacy.com/app/gigamole53/PulseView?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DevLight-Mobile-Agency/PulseView&amp;utm_campaign=Badge_Grade)

![](https://lh4.googleusercontent.com/-mqVBaXK0XM0/VyhroJmmU7I/AAAAAAAACUs/OmfzeRZsYNQhNAdgFmKvFIU5XDiJ3-z3wCL0B/w401-h689-no/pv.gif)

You can check the sample app [here](https://github.com/DevLight-Mobile-Agency/PulseView/tree/master/app).

Download
------------

You can download an `.aar` from GitHub's [releases page](https://github.com/DevLight-Mobile-Agency/PulseView/releases).

Or alternatively use Gradle jCenter:

```groovy
dependencies {
    repositories {
        mavenCentral()
        maven {
            url  'http://dl.bintray.com/gigamole/maven/'
        }
    }
    compile 'com.github.devlight.pulseview:library:+'
}
```

Gradle Maven Central:

```groovy
compile 'com.github.devlight.pulseview:library:1.0.2'
```

Maven:

```groovy
<dependency>
    <groupId>com.github.devlight.pulseview</groupId>
    <artifactId>library</artifactId>
    <version>1.0.2</version>
    <type>aar</type>
</dependency>
```

Android SDK Version
=========

`PulseView` requires a minimum SDK version of 11. 

Sample
========
        
For `PulseView` you can set such parameters as:
 
 - icon:
    
    at first you need to set icon for `PulseView`.
    
 - icon width and height:
     
    allows you to set size of the icon.
        
 - pulse side measure:
    
    allows you to set pulse side measure. Width or height of `PulseView`.
    
 - pulse count:
    
    allows you to set pulse count.
    
 - pulse spawn period:
     
    allows you to set pulse spawn period.
     
 - pulse alpha:
     
    allows you to set alpha to pulse.
    
 - pulse color:
     
    allows you to set pulse color.

 - interpolator:
     
    allows you to set an interpolator for the pulse.

 - listener:
     
    allows you to set pulse listener. `onStartPulse()` and `onFinishPulse()` listeners.

<b>Tips</b>

The icon to pulse can be a normal bitmap or a `SVG` file.

In preview mode `PulseView` renders incorrectly because the `Canvas` can`t scale in this mode.

<b>Init</b>

Check out in code init:

```java
final PulseView pulseView = (PulseView) findViewById(R.id.pv);
pulseView.setPulseColor(Color.BLACK);
pulseView.setPulseCount(5);
pulseView.setPulseMeasure(PulseView.PulseMeasure.WIDTH);
pulseView.setIconHeight(200);
pulseView.setIconWidth(200);
pulseView.setIconRes(R.drawable.icon);
pulseView.setPulseAlpha(70);
pulseView.setInterpolator(new LinearInterpolator());
pulseView.setPulseListener(new PulseView.PulseListener(...));
```

To start or finish pulse you need to call methods:

```java
pulseView.startPulse();
pulseView.finishPulse();
```
            
Other methods can be seen within the sample application.

And `XML` init:

```xml
<com.gigamole.library.PulseView
    android:id="@+id/pv"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:pv_icon="@drawable/icon"
    app:pv_alpha="70"
    app:pv_color="#eae761"
    app:pv_count="8"
    app:pv_measure="height"
    app:pv_icon_width="168dp"
    app:pv_icon_height="194dp"
    app:pv_spawn_period="700"
    app:pv_interpolator="@android:anim/linear_interpolator"/>
```

Getting Help
======

To report a specific problem or feature request, [open a new issue on Github](https://github.com/DevLight-Mobile-Agency/PulseView/issues/new).

License
======

Apache 2.0 and MIT. See [LICENSE](https://github.com/DevLight-Mobile-Agency/PulseView/blob/master/LICENSE.txt) file for details.

Author
=======

Made in [DevLight Mobile Agency](https://github.com/DevLight-Mobile-Agency)

Created by [Basil Miller](https://github.com/GIGAMOLE) - [@gigamole](mailto:http://gigamole53@gmail.com)
