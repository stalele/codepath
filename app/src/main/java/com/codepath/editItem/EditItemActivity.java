package com.codepath.editItem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.codepath.simpletodo.R;

public class EditItemActivity extends AppCompatActivity {
    String editItem;
    EditText etEditItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_edit_item);
        editItem = getIntent().getStringExtra("item");
        etEditItem = (EditText) findViewById((R.id.etEditItem));
        etEditItem.setText(editItem);
        etEditItem.requestFocus(View.FOCUS_LEFT);
  }

    public void onEditItem(View view) {
        Intent data = new Intent();
        data.putExtra("editedItem", etEditItem.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }


}
