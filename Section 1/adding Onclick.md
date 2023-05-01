# Adding onclick events 




# get a view by id 

package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
# -------------------------
        val btnSkill = findViewById<Button>(R.id.btnSkill)
# -------------------------

        
    }
}

# <the 'Intents 
- What happens when you click a btn 
- Like moving from one activity to another 
- There are two types 
    - <The 'Implicite-intents
        - transition to another app e.g website
    - <the 'Explicit-itents
        - transition between activities 

# We will be <using 'Explicit-itents    



# Intents ... 

# NB .. be <sure to import 'Intent() from  android.content.Intent


package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSkill = findViewById<Button>(R.id.btnSkill)

        btnSkill.setOnClickListener {
            intent = Intent(
                this // package context
            )
        }
    }
}




# MainActivity.kt

- <the 'this is the  package context
- <the  'SkillsActivity::class.java is the page we wish to open 
- <the      'startActivity(intent) opens a new activity

  btnSkill.setOnClickListener {
            intent = Intent(
                this,
                SkillsActivity::class.java
            )
            startActivity(intent)
        }


# full_code ... 

package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

# ....from getting the btn to movin to a new page ..........
        val btnSkill = findViewById<Button>(R.id.btnSkill)

        btnSkill.setOnClickListener {
            intent = Intent(
                this,
                SkillsActivity::class.java
            )
            startActivity(intent)
        }
# ..........

    }
}
        btnSkill.setOnClickListener {
            intent = Intent(
                this,
                SkillsActivity::class.java
            )
            startActivity(intent)
        }
    }
}

# ----------






# activity_main