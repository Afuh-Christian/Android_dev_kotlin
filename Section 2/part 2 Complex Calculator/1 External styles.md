# res/values/styles -------------------------------------------------------------------------------------------------------------------------------


<?xml version="1.0" encoding="utf-8" ?>

<resources>

    <style name="parentInput">
        <item name="android:orientation">vertical</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:paddingTop">50dp</item>
        <item name="android:paddingStart">20dp</item>
        <item name="android:paddingEnd">20dp</item>
        <item name="android:paddingBottom">50dp</item>

    </style>

    <style name="inputValue">
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:hint">Enter number</item>
        <item name="android:textSize">30sp</item>
        <item name="android:gravity">right</item>
        <item name="android:textColor">@color/white</item>


    </style>

    <style name="outputValue">
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:hint">Answer</item>
        <item name="android:textSize">30sp</item>
        <item name="android:layout_marginTop">30dp</item>
        <item name="android:gravity">right</item>
        <item name="android:textColor">@color/white</item>

    </style>

















    <style name="parentOperatorColumn">
        <item name="android:orientation">vertical</item>
        <item name="android:layout_height">match_parent</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:background">@color/black</item>

    </style>


    <style name="buttonRow">

        <item name="android:orientation">horizontal</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_weight">1</item>
    </style>

    <style name="buttonNormal">
        <item name="android:padding">5dp</item>
        <item name="android:layout_margin">2dp</item>
        <item name="android:layout_height">match_parent</item>
        <item name="android:layout_width">wrap_content</item>
        <item name="android:layout_weight">1</item>
        <item name="android:textSize">30dp</item>
        <item name="android:background"></item>



    </style>




</resources>







































# xml   -------------------------------------------------------------------------------------------------------------------------------


<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:background="@color/black"
    >



    <LinearLayout
    style="@style/parentInput"

        >

        <TextView
            android:id="@+id/textView6"
        style="@style/inputValue"
            />

        <TextView
            android:id="@+id/textView5"
          style="@style/outputValue"
           />
    </LinearLayout>



    <LinearLayout
   style="@style/parentOperatorColumn"

        >




    <LinearLayout
     style="@style/buttonRow"
        >

        <Button
             style="@style/buttonNormal"
            android:text="AC"

            />

        <Button
            style="@style/buttonNormal"
            android:text="DEL" />

        <Button
            style="@style/buttonNormal"
            android:text="" />

        <Button
            style="@style/buttonNormal"
            android:textColor="@color/orange"
            android:text="/" />
    </LinearLayout>

    <LinearLayout
        style="@style/buttonRow"
        >

        <Button
            style="@style/buttonNormal"
            android:text="7" />

        <Button
            style="@style/buttonNormal"
            android:text="8" />

        <Button
            style="@style/buttonNormal"
            android:text="9" />

        <Button
            style="@style/buttonNormal"
            android:textColor="@color/orange"
            android:text="x" />
    </LinearLayout>

    <LinearLayout
        style="@style/buttonRow"
        >

        <Button
            style="@style/buttonNormal"
            android:text="4" />

        <Button
            style="@style/buttonNormal"
            android:text="5" />

        <Button
            style="@style/buttonNormal"
            android:text="6" />

        <Button
            style="@style/buttonNormal"
            android:textColor="@color/orange"
            android:text="-" />
    </LinearLayout>

    <LinearLayout
        style="@style/buttonRow"
        >

        <Button
            style="@style/buttonNormal"
            android:text="1" />

        <Button
            style="@style/buttonNormal"
            android:text="2" />

        <Button
            style="@style/buttonNormal"
            android:text="3" />

        <Button
            style="@style/buttonNormal"
            android:textColor="@color/orange"
            android:text="+" />
    </LinearLayout>


    <LinearLayout
        style="@style/buttonRow"
        >

        <Button
            style="@style/buttonNormal"
            android:text="." />

        <Button
            style="@style/buttonNormal"
            android:text="0" />

<!--        <Button-->
<!--            style="@style/buttonNormal"-->
<!--            android:text="a" />-->

        <Button
            style="@style/buttonNormal"
            android:layout_weight="2"
            android:text="="
            android:background="@color/orange"


            />
    </LinearLayout>


    </LinearLayout>






</androidx.appcompat.widget.LinearLayoutCompat>












