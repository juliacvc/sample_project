package ph.edu.dlsu.mobdeve.coronel.julia.mobdeve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ph.edu.dlsu.mobdeve.coronel.julia.mobdeve.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    //Helps access UI components directly
    var binding:ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        var bundle = intent.extras
        var usernameBundle = bundle!!.getString("username_bundle")

        var usernameExtra = intent.getStringExtra("username_extra")

        Log.i("Home Activity", "Username from Bundle: $usernameBundle")
        Log.i("Home Activity", "Username from Bundle: $usernameExtra")

        binding!!.etMessage.text = usernameBundle
    }
}