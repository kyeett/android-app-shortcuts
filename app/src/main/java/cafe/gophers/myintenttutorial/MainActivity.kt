package cafe.gophers.myintenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val CHARGE_BATTERY_ACTION = "cafe.gophers.myintenttutorial.Charge"
    val SHOW_WIDGETS_ACTION = "cafe.gophers.myintenttutorial.ShowWidgets"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Following code added
        val action: String? = intent?.action
        text_view.text = when (action) {
            CHARGE_BATTERY_ACTION -> "Charging battery"
            SHOW_WIDGETS_ACTION -> "Showing some widgets"
            else -> "Main app"
        }
    }
}
