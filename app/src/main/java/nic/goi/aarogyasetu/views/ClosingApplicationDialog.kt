package nic.goi.aarogyasetu.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_no_bluetooth.*
import nic.goi.aarogyasetu.R
import nic.goi.aarogyasetu.utility.LocalizationUtil

class ClosingApplicationDialog: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.dialog_on_closing, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        textView2.text = LocalizationUtil.getLocalisedString(context, R.string.do_you_want_to_close_this_application)
        view.findViewById<View>(R.id.close_app_yes)
            .setOnClickListener {

                activity?.finish()
                dismissAllowingStateLoss()

            }

        view.findViewById<View>(R.id.close_app_no)
            .setOnClickListener {
                activity?.finishAndRemoveTask()
                dismissAllowingStateLoss()
            }
    }
}




