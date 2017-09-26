package yali.hkonnect.net.yalilearns;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class QuizFragment extends Fragment {
    private static final String ARG_Quiz = "quiz";

    public QuizFragment newInstance(String quiz) {
        QuizFragment fragment = new QuizFragment();

        Bundle args = new Bundle();
        args.putString(ARG_Quiz, quiz);
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_quiz, container, false);
        Button buttonQuiz = rootView.findViewById(R.id.buttonQuiz);

        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = getArguments().getString(ARG_Quiz);
                assert link != null;
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
            }
        });

        return rootView;
    }
}
