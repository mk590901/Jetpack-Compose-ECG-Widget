# Jetpack Compose ECG Widget

## Introduction

The presented project is an attempt to implement a widget for visualization of __ECG__ using the __Jetpack Compose__ extension for Android.
The new project is a logical continuation of the previously created application in __Kotlin__: https://github.com/mk590901/Kotlin-ECG-Widget-Viewer. As a matter of fact, that project was created with the goal of developing a certain core: an independent set of classes for use with various graphics libraries. And this idea paid off: the same classes as before are used, in the case of __Compose graphics__ and __JetPack coroutines__ instead of handlers. This once again confirms the idea that the main thing is the business logic of the application. Everything else: graphics, timers, coroutines and threads, _comes and goes_.

## Implementation

1) The _CircularBuffer_, _GraphMode_ and _Utils_ classes (and files) remained unchanged.
2) Changes in the StoreWrapper class are due to the fact that Compose uses its own specific classes to represent graphic elements such as _Path_ and _Point (Offset)_. Therefore, the __prepare...__ procedures have been changed, and variables of the specified types now refer not to _android.graphics.Path_ and _android.graphics.Point_, but to _androidx.compose.ui.graphics.Path_ and _androidx.compose.ui.geometry.Offset_. Pay attention on import directives on start of the file.
3) The widget itself is implemented as the __@Composable GraphEcgWidget__ function in the _GraphicEchWidget.kt_ file.

## Movie

https://github.com/mk590901/Jetpack-Compose-ECG-Widget/assets/125393245/8025ce99-8c38-4cfe-8100-1d414d8e9fcc

__NB!__ As before, clicking (touching) on the rendering area causes ECG drawing to stop; clicking again will resume drawing.




