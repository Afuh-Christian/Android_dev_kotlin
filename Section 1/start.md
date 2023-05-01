# For the layout ... 

- <We choose 'LinearLayout for the app 
- we have to set <the 'orientation 

main_acitvity.xml

<?xml version="1.0" encoding="utf-8"?>
# --------------------------------
    <LinearLayout 
    android:orientation="vertical"
# --------------------------------
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

</LinearLayout>











# <the 'savedInstanceState: Bundle?

- <This parameter in the onCreate() method is to save the state of the app at a particular instance ... e.g I'm watching a video on youTube and I get a message on whatsapp ... I can got to whatsapp and reply the message ... then come back to youTube and continue watching the video ... 










# activity_main.xml 

<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat
    android:orientation="vertical"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <ImageView
        android:id="@+id/imProfile"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/image"
        android:padding="10dp"
        android:layout_margin="20dp"
        />

    <TextView
        android:id="@+id/tvName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="25sp"
        android:layout_gravity="center"
        android:gravity="center"
        android:padding="10dp"
        android:layout_margin="10dp"
        android:text="Afuh Christian" />

    <TextView
        android:id="@+id/tvDesignation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="25sp"
        android:layout_gravity="center"
        android:gravity="center"
        android:padding="10dp"
        android:layout_margin="10dp"
        android:text="Software Engineer" />
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >

        <Button
            android:id="@+id/btnSkill"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="20dp"
            android:text="Skills" />

        <Button
            android:id="@+id/btnEducation"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="20dp"
            android:text="Education" />

    </LinearLayout>


    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >

        <Button
            android:id="@+id/btnWork"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="20dp"
            android:text="Work" />

        <Button
            android:id="@+id/btnArchievment"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="20dp"
            android:text="Archievments" />

    </LinearLayout>
</androidx.appcompat.widget.LinearLayoutCompat>





