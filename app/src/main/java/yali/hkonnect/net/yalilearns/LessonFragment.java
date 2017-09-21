package yali.hkonnect.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class LessonFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "tab";
    private static final String ARG_TITLE = "title";
    private static final String ARG_LESSON = "lesson";
    private static final String ARG_VIDEO = "video";
    private static final String TAG_RESSOURCE_IMAGE = "mipmap";

    public LessonFragment newInstance(int sectionNumber, String title) {
        LessonFragment fragment = new LessonFragment();

        LessonObject lesson = new LessonObject().getLesson(title, sectionNumber);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putString(ARG_TITLE, title);
        args.putSerializable(ARG_LESSON, lesson);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lesson, container, false);

        TextView textViewTitle = rootView.findViewById(R.id.textViewTitle);
        TextView textViewDescription = rootView.findViewById(R.id.textViewDescription);
        ImageView imageViewPicture = rootView.findViewById(R.id.imageViewPicture);
        ImageButton buttonPlayer = rootView.findViewById(R.id.buttonPlayer);
        ImageButton buttonTranscript = rootView.findViewById(R.id.buttonTranscript);

        final LessonObject lesson = (LessonObject) getArguments().getSerializable(ARG_LESSON);

        assert lesson != null;
        textViewDescription.setText(lesson.getDescription());
        textViewTitle.setText(lesson.getName());

        int picture = getResources().getIdentifier(lesson.getPicture(), TAG_RESSOURCE_IMAGE, getActivity().getPackageName());
        if (picture != 0)
            imageViewPicture.setImageResource(picture);

        // Handle click player button
        buttonPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlayerActivity.class);
                intent.putExtra(ARG_VIDEO, lesson.getVideo());
                startActivity(intent);
            }
        });

        // Handle click transcript button
        buttonTranscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return rootView;
    }

}
