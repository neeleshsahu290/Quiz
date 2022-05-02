package com.Neelesh.quiz.activity

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.Neelesh.quiz.BuildConfig
import com.Neelesh.quiz.R
import com.google.android.material.navigation.NavigationView


class FirstPageActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    var nusername : String? = null

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        setContentView(R.layout.activity_first_page)

        nusername = sharedPreferences.getString("Title", "Name") as String

        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+ BuildConfig.APPLICATION_ID+"\n\n")
            type = "text/plain"
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout_first)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        val headerView : View = navView.getHeaderView(0)
        val navigationname: TextView =headerView.findViewById(R.id.txtnavigationname)
        val signoutbtn: Button =headerView.findViewById(R.id.btnsignout)

        navigationname.text="$nusername"
        signoutbtn.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
            sharedPreferences.edit().clear().apply()
            finish()
        }

        val maindrawer:Menu= navView.menu
      //  val contactus: MenuItem =maindrawer.findItem(R.id.contactus)
        val share: MenuItem =maindrawer.findItem(R.id.share)
        val rate: MenuItem =maindrawer.findItem(R.id.rate)
    //    val exit: MenuItem =maindrawer.findItem(R.id.exit)
        /*contactus.setOnMenuItemClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://neeleshsahu2900.blogspot.com/2020/08/static-gk-and-gs-learner.html"))
            startActivity(intent)
            drawerLayout.closeDrawers()
            true
        }*/

        share.setOnMenuItemClickListener {
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
            drawerLayout.closeDrawers()
            true
        }
        rate.setOnMenuItemClickListener {
            try {
                var playstoreuri1: Uri = Uri.parse("market://details?id=" + packageName)
                //or you can add
                //var playstoreuri:Uri=Uri.parse("market://details?id=manigautam.app.myplaystoreratingapp")
                var playstoreIntent1: Intent = Intent(Intent.ACTION_VIEW, playstoreuri1)
                startActivity(playstoreIntent1)
                //it genrate exception when devices do not have playstore
            }catch (exp:Exception){
                var playstoreuri2: Uri = Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)
                //var playstoreuri:Uri=Uri.parse("https://play.google.com/store/apps/details?id=manigautam.app.myplaystoreratingapp")
                var playstoreIntent2: Intent = Intent(Intent.ACTION_VIEW, playstoreuri2)
                startActivity(playstoreIntent2)
            }
            //supportActionBar?.title = "Rate"
            //finish()
            drawerLayout.closeDrawers()
            true
        }
        /*exit.setOnMenuItemClickListener {
            exitfun()
            drawerLayout.closeDrawers()
            true
        }*/

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.home), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    fun exitfun (){
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to exit")
            .setPositiveButton("Cancel",
                DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()
                })
            .setNegativeButton("Exit",
                DialogInterface.OnClickListener { dialog, id ->
                    finish()
                })
        // Create the AlertDialog object and return it
        builder.create()
        builder.show()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}