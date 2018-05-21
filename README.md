<br/>
<p align="center">
  <a href="http://devlight.io">
      <img src ="https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScLVBKck51Z1Rzb0E" alt="Devlight"/>
  </a>
</p>
<br/>

PulseView
=========

Widget that generates pulsation relative to your icons.

[![Android Arsenal](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScTm9HT0JzcmpHOVE)](http://android-arsenal.com/details/1/3537)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[![Android](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wSccEZaclNGN0R5OWc)](https://github.com/DevLight-Mobile-Agency)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[![Download](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScaDl2U0QtWUx3emM)](https://bintray.com/gigamole/maven/pulseview/_latestVersion)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[![License](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScU0tmeFpGMHVWNWs)](https://github.com/DevLight-Mobile-Agency/PulseView/blob/master/LICENSE.txt)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[![Codacy](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScSHhmckZyeGJDcXc)](https://www.codacy.com/app/gigamole53/PulseView?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DevLight-Mobile-Agency/PulseView&amp;utm_campaign=Badge_Grade)

<br/>

<p align="center">
    <img src="https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScN1lmb19QZklFTEk"/>
</p>

You can check the sample app [here](https://github.com/DevLight-Mobile-Agency/PulseView/tree/master/app).

Warn
====
```
This library is not more supported. 
If you want to add new feature or fix a bug, grab source code and do it. 
If you think your fix or feature would be useful to other developers, 
I can add link of your repository to this README file. 
Thank you for using our libraries.
```

Download
========

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
======

<b>Parameters</b>
        
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
============

To report a specific problem or feature request, [open a new issue on Github](https://github.com/DevLight-Mobile-Agency/PulseView/issues/new).

Credits
=======

|[Greg Wilkinson](https://dribbble.com/gregrwilkinson)|[Thomas Budiman](https://dribbble.com/thebuddyman)|
|:---------------------------------------------------:|:------------------------------------------------:|
|[![](https://d13yacurqjgara.cloudfront.net/users/7851/screenshots/2259256/cel-fianimation-2.gif)](https://dribbble.com/shots/2259256-Cel-Fi-Search-Animation)|[![](https://d13yacurqjgara.cloudfront.net/users/153277/screenshots/2242921/open-uri20150914-3-1sa3649)](https://dribbble.com/shots/2242921-Find-Nearby-Users-Concept)|

Author
======

Created by [Basil Miller](https://github.com/GIGAMOLE) - [@gigamole](mailto:http://gigamole53@gmail.com)

Company
=======

[![Facebook](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScaGhGVFNKU0VxMnc)](https://www.facebook.com/devlightagency)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[![Twitter](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wScZ1ExQWh5cHF5cVE)](https://twitter.com/DevLightIO)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[![LinkedIn](https://drive.google.com/uc?export=download&id=0BxPO_UeS7wSccGZINzEycE1nVFE)](https://www.linkedin.com/company/devlight)

[Here](https://github.com/DevLight-Mobile-Agency) you can see open source work developed by Devlight LLC.  
This and another works is an exclusive property of Devlight LLC. 

If you want to use this library in applications which will be available on Google Play, please report us or author of the library about it.

Whether you're searching for a new partner or trusted team for creating your new great product we are always ready to start work with you. 

You can contact us: info@devlight.io or opensource@devlight.io.  
Thanks in advance.

Devlight LLC, 2016  
[devlight.io](http://devlight.io) 
