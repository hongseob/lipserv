package com.lip;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
    public String prefix="!";

    public void OnMessageReceive(MessageReceivedEvent event){
        Message msg=event.getMessage();
        if(msg.getContentRaw().equals("!ping")){
            MessageChannel channel=event.getChannel();
            long time=System.currentTimeMillis();
            channel.sendMessage("Pong!").queue(response->{
                response.editMessageFormat("Pong:%d ms",System.currentTimeMillis()-time).queue();
            });
        }
    }
}
