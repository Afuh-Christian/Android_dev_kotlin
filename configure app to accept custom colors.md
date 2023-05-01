# To  do this ... place the <value  'Theme.AppCompat.Light.NoActionBar to 'parent in both 'theme and 'theme(night) files in the 'res/values/themes path>


# 'res/values/themes  and # 'res/values/themes(night)

  <style name="Base.Theme.ComplexCalculator1" parent="Theme.AppCompat.Light.NoActionBar">
</style>

# res/values/themes/theme.xml
<resources xmlns:tools="http://schemas.android.com/tools">

    <style name="Base.Theme.ComplexCalculator1" 
# -------------------
parent="Theme.AppCompat.Light.NoActionBar">
# -------------------
    </style>

    <style name="Theme.ComplexCalculator1" parent="Base.Theme.ComplexCalculator1" />
</resources>