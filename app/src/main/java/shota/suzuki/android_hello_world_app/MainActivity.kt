package shota.suzuki.android_hello_world_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import shota.suzuki.android_hello_world_app.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.sendBtnId.setOnClickListener {
            val message = editTextId.text.toString()
            if (!TextUtils.isEmpty(message)) {
                AlertDialog.Builder(this)
                    .setMessage("Hello $message")
                    .setPositiveButton("OK", {_, _, -> })
                    .show()
            } else {
                Toast.makeText(this, getString(R.string.warning_message), Toast.LENGTH_SHORT).show()
            }
        }

        binding.clearBtnId.setOnClickListener {
            editTextId.text = null
        }
    }
}
