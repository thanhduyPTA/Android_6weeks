package tuan06.student.app_tuan06_bai01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

//        int itemId = 113;
//        menu.add(0, itemId, 0, "Menu 1");
//        itemId = 114;
//        menu.add(0, itemId, 1, "Menu 2");
//        SubMenu sub3 = menu.addSubMenu("Menu 3");
//        itemId = 115;
//        sub3.add(0, itemId, 0, "Sub 1 menu 3");
//        itemId = 116;
//        sub3.add(0, itemId, 1, "Sub 2 menu 3");
//        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.dsSV:
                Toast.makeText(MainActivity.this, "Bạn đang chọn xem danh sách sinh viên", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dsLop:
                Toast.makeText(MainActivity.this, "Bạn đang chọn xem danh sách lớp", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dh1A:
                Toast.makeText(MainActivity.this, "Bạn đang chọn xem lớp đại học tin học 1A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dh1B:
                Toast.makeText(MainActivity.this, "Bạn đang chọn xem lớp đại học tin học 1B", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
