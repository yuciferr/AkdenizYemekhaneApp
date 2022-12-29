package com.example.akdenizyemekhaneapp.ui.detail

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.akdenizyemekhaneapp.databinding.DialogReviewBinding

class RateDialog: DialogFragment() {

    private lateinit var binding: DialogReviewBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogReviewBinding.inflate(layoutInflater)

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(binding.root)

        binding.apply {
            rateClose.setOnClickListener {
                dismiss()
            }
            rateCancel.setOnClickListener {
                dismiss()
            }
            rateSend.setOnClickListener {
                Toast.makeText(requireContext(), "Thank you for your feedback!", Toast.LENGTH_SHORT).show()
                dismiss()
            }
        }


        val dialog = builder.create()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }
}