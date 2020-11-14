package androidx.core.app;

import com.bc.navweightwatchers.R;
import android.view.View;

import androidx.fragment.app.ListFragment;

public class ListFragmentLayout {
    static final int INTERNAL_EMPTY_ID = 0x00ff0001;
    static final int INTERNAL_LIST_CONTAINER_ID = 0x00ff0003;

	public static void setupIds(View view) {
        view.findViewById(R.id.flitem).setId(INTERNAL_EMPTY_ID);
        view.findViewById(R.id.flgrams).setId(INTERNAL_EMPTY_ID);
        view.findViewById(R.id.flpointsLayout).setId(INTERNAL_EMPTY_ID);
        view.findViewById(R.id.table_list_container_id).setId(INTERNAL_LIST_CONTAINER_ID);
	}
}
