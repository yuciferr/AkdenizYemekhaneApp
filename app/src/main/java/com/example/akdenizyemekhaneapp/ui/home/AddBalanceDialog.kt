package com.example.akdenizyemekhaneapp.ui.home

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.akdenizyemekhaneapp.databinding.DialogAddBalanceBinding
import com.example.akdenizyemekhaneapp.databinding.FragmentHomeBinding

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
                if(name.text.toString().isEmpty()){
                    name.error = "Enter your name"
                }else if (cardNumber.text.toString().length!= 16){
                    cardNumber.error = "Enter your card number"
                } else if (expDate.text.toString().length!= 5){
                    expDate.error = "Enter your expiration date"
                } else if (cvc.text.toString().length!= 3){
                    cvc.error = "Enter your cvc"
                } else {
                    Toast.makeText(context, "Your balance is added", Toast.LENGTH_SHORT).show()
                    dismiss()
                }
            }

        }

        val dialog = builder.create()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }
}