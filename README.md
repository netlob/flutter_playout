# AVPlayer for Flutter

Audio & Video player in Flutter. This plugin provides audio/video playback with background audio
support and lock screen controls for both iOS & Android. Also provides player events such as onPlay,
onPause, onTime etc. See example for more details.

- Video supports **HLS** and **Progressive Steaming** for both iOS & Android with multi-audio support.

- Audio supports playback from URL only.

## Getting Started

### Android

Uses `ExoPlayer` with `PlatformView` for Video playback and `MediaPlayer` for audio playback.

When using this plugin, please make sure you have included a notification icon
for your project in `drawable` resource directory named `ic_notification_icon`.
This plugin will use this icon to show lock screen controls for playback.

### iOS

Uses `AVPlayer` with `PlatformView` for video playback and `AVPlayer` with Flutter
`MethodChannel`s for audio playback.

Please make sure you've enabled background audio capability for your project.
Please also note that the player might not function properly on a simulator.

Opt-in to the embedded views preview by adding a boolean property to the app's
**Info.plist** file with the key `io.flutter.embedded_views_preview` and the value `YES`.

## HLS MultiAudio Support

Please see example app on how to implement multi audio for Android. On iOS multi audio is
provided natively by the AVPlayer.
