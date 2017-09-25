package yali.hkonnect.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CategoryFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "category";

    public CategoryFragment() {
    }

    public CategoryFragment newInstance(int category) {
        CategoryFragment fragment = new CategoryFragment();

        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, category);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;

        switch (getArguments().getInt(ARG_SECTION_NUMBER))
        {
            case 1:
                rootView = inflater.inflate(R.layout.card_leadership, container, false);
                break;
            case 2:
                rootView = inflater.inflate(R.layout.card_focus, container, false);
                break;
            case 3:
                rootView = inflater.inflate(R.layout.card_civic, container, false);
                break;
            case 4:
                rootView = inflater.inflate(R.layout.card_business, container, false);
                break;
            case 5:
                rootView = inflater.inflate(R.layout.card_management, container, false);
                break;
            case 6:
                rootView = inflater.inflate(R.layout.card_mandela, container, false);
                break;
            default:
                rootView = inflater.inflate(R.layout.card_leadership, container, false);
        }
        return rootView;
    }

}
