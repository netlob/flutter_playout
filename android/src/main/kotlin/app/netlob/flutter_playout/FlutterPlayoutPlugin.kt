package app.netlob.flutter_playout

import io.flutter.plugin.common.PluginRegistry.Registrar
import app.netlob.flutter_playout.audio.AudioPlayer
import app.netlob.flutter_playout.video.PlayerViewFactory

class FlutterPlayoutPlugin {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      PlayerViewFactory.registerWith(registrar)
      AudioPlayer.registerWith(registrar)
    }
  }
}
