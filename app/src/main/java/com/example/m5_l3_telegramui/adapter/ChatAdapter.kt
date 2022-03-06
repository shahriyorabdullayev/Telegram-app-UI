package com.example.m5_l3_telegramui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l3_telegramui.R
import com.example.m5_l3_telegramui.fragment.ChatFragment
import com.example.m5_l3_telegramui.fragment.ContactFragment
import com.example.m5_l3_telegramui.model.Chat

class ChatAdapter(val context: ChatFragment, val items: ArrayList<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return MessageVievHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is MessageVievHolder) {
            holder.apply {
                ivProfile.setImageResource(chat.profile)

                tvFullname.text = chat.fullname
                tvMessage.text = chat.message

            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class MessageVievHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvFullname = view.findViewById<TextView>(R.id.tv_fullname)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)

        val ivProfile = view.findViewById<ImageView>(R.id.iv_profile)

    }


}