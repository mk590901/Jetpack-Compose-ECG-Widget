# Jetpack Compose ECG Widget

## Introduction

The presented project is an attempt to implement a widget for visualization of ECG using the Jetpack Compose extension for Android.
The new project is a logical continuation of the previously created application in Kotlin: https://github.com/mk590901/Kotlin-ECG-Widget-Viewer. As a matter of fact, that project was created with the goal of developing a certain core: an independent set of classes for use with various graphics libraries. And this idea paid off: the same classes as before are used, in the case of Compose graphics and JetPack coroutines instead of handlers. This once again confirms the idea that the main thing is the business logic of the application. Everything else: graphics, timers, coroutines and threads, comes and goes.
