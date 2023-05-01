# 02:15:59.257 

# Step 1 xml -----------------------------------------------------------------------------------------------------------------------





# step 2 ...... apply plugin to get id without using getViewbyId() -------------------------------------------------------------------------------------

# Gradle/gradle.build(Module.app)


dependencies {

    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
# -------------------
    apply plugin: 'kotlin-android-extensions'
# -------------------

}



# Now .... we are importing <the 'input1 id from 'kotlinx.android.synthetic.main.activity_main.input1>

import kotlinx.android.synthetic.main.activity_main.input1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val input1 = input1

    }
}


# .... NB ... use the old view binding method ... this one is outDated



# Step 3 .... kt  ----------------------------------------------------------------------------------------------------------------------- 


