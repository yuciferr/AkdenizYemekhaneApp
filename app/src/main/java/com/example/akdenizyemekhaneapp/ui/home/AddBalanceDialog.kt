package com.example.akdenizyemekhaneapp.ui.home

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.akdenizyemekhaneapp.databinding.DialogAddBalanceBinding

class AddBalanceDialog: DialogFragment() {

    private lateinit var binding: DialogAddBalanceBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogAddBalanceBinding.inflate(layoutInflater)

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(binding.root)

        binding.apply {
            balanceClose.setOnClickListener{
                dismiss()
            }
            cancelButton.setOnClickListener {
                dismiss()
            }
            addButton.setOnClickListener {
                Toast.makeText(requireContext(), "Balance added!", Toast.LENGTH_SHORT).show()
                dismiss()
            }

        }

        val dialog = builder.create()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }
}