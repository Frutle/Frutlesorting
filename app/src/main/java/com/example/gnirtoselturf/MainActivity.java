package com.example.gnirtoselturf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//сортировки
//решения алгебраических и трансцендетных уравнений
//поиск прыжками,бинарный поиск,интерполяционный поиск,экспоненциальный поиск
//жадный алгоритм
//алгоритм поиска пути в глибину и ширину

/*создать главный фрагмент и добавить кнопи для +
сортировок +
метод простой итерации,метод Ньютона +
метод простой итерации и метод Ньютона для СНУ
*/
/*добавить бинарный боиск +
добавить метод простой итерации,метод Ньютона{
добавить интерфейс с возможность ввести уравнение}
добавить метод простой итерации и метод Ньютона для СНУ
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity, MainFragment.newInstance())
                    .commit(); }
    }
}