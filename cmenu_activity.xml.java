<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <LinearLayout
        android:layout_width="409dp"
        android:layout_height="354dp"
        android:layout_marginTop="16dp"
        android:orientation="horizontal"
        app:layout_constraintTop_toTopOf="parent"
        tools:layout_editor_absoluteX="-42dp">

        <TextView
            android:id="@+id/tv1"
            android:layout_width="wrap_content"
            android:layout_height="222dp"
            android:layout_weight="1"
            android:text="TextView" />

        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Button" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
