package tuan06.student.app_tuan06_bai02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        registerForContextMenu(btn);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.my_menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.itemRed:
                btn.setTextColor(getResources().getColor(R.color.colred, null));
                break;
            case R.id.itemGreen:
                btn.setTextColor(getResources().getColor(R.color.colgreen,null));
                break;
            case R.id.itemBlue:
                btn.setTextColor(getResources().getColor(R.color.colblue, null));
                break;
            default:
                btn.setTextColor(getResources().getColor(R.color.colred, null));
                break;
        }
        return super.onContextItemSelected(item);
    }
}
