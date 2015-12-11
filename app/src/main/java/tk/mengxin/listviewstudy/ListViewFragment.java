package tk.mengxin.listviewstudy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 *
 * We will display a list view with custom item view in this fragment:
 *
 * 1. Create a class which will show as an item in the List view.
 * 2. Create a item view
 * 3. Create a adapter for the class and the view
 *
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Bind(R.id.list_view)
    ListView mListView;

    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Load the List view

        //There are 3 step:
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(getActivity(),
                R.layout.fruit_item, fruitList);
        mListView.setAdapter(adapter);

    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.ic_radio_24dp);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.ic_radio_24dp);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.ic_radio_24dp);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_radio_24dp);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.ic_radio_24dp);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.ic_radio_24dp);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_radio_24dp);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_radio_24dp);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.ic_radio_24dp);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.ic_radio_24dp);
        fruitList.add(mango);
        Fruit apple1 = new Fruit("Apple", R.drawable.ic_radio_24dp);
        fruitList.add(apple1);
        Fruit banana1 = new Fruit("Banana", R.drawable.ic_radio_24dp);
        fruitList.add(banana1);
        Fruit orange1 = new Fruit("Orange", R.drawable.ic_radio_24dp);
        fruitList.add(orange1);
        Fruit watermelon1 = new Fruit("Watermelon", R.drawable.ic_radio_24dp);
        fruitList.add(watermelon1);
        Fruit pear1 = new Fruit("Pear", R.drawable.ic_radio_24dp);
        fruitList.add(pear1);
        Fruit grape1 = new Fruit("Grape", R.drawable.ic_radio_24dp);
        fruitList.add(grape1);
        Fruit pineapple1 = new Fruit("Pineapple", R.drawable.ic_radio_24dp);
        fruitList.add(pineapple1);
        Fruit strawberry1 = new Fruit("Strawberry", R.drawable.ic_radio_24dp);
        fruitList.add(strawberry1);
        Fruit cherry1 = new Fruit("Cherry", R.drawable.ic_radio_24dp);
        fruitList.add(cherry1);
        Fruit mango1 = new Fruit("Mango", R.drawable.ic_radio_24dp);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);

    }
}
