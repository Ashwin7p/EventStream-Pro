package com.techbank.account.cmd.api.commands;

import com.techbank.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    CloseAccountCommand(String id){
        super(id);
    }
}
