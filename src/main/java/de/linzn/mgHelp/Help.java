package de.linzn.mgHelp;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class Help extends Command {
    public Help() {
        super("help");
    }

    public void execute(CommandSender sender, String[] args) {
        if (args.length >= 1) {
            if (args[0].equalsIgnoreCase("cubit")) {
                if (args.length == 2 && args[1].equalsIgnoreCase("2")) {
                    this.cubit2(sender);
                    return;
                }

                this.cubit(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("mcmmo")) {
                this.mcmmo(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("jobs")) {
                this.jobs(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("economy")) {
                this.economy(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("teleport")) {
                this.teleport(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("minestorage")) {
                this.minestorage(sender);
                return;
            }

            if (args[0].equalsIgnoreCase("arenen")) {
                this.arenen(sender);
                return;
            }
        }

        this.help(sender);
    }

    private void help(CommandSender sender) {
        TextComponent vote = new TextComponent("§aVote: §dhttps://vote.MineGaming.de");
        vote.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://vote.MineGaming.de"));
        vote.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dVotes öffnen")).create()));
        TextComponent forum = new TextComponent("§aUnser Forum: §dhttps://www.MineGaming.de");
        forum.setClickEvent(new ClickEvent(Action.OPEN_URL, "https://www.MineGaming.de"));
        forum.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder("§dÖffne www.MineGaming.de")).create()));
        sender.sendMessage(new TextComponent("§e§lMineGaming Hilfeseite"));
        sender.sendMessage(new TextComponent("§eWillkommen auf der Übersicht der Hilfeseite!"));
        sender.sendMessage(new TextComponent("§eDiese Seite gibt einen groben Überblick über unsere Befehle!"));
        sender.sendMessage(new TextComponent("§eBitte wähle hier das jeweilige Plugin aus."));
        sender.sendMessage(new TextComponent("§a/help cubit  §e - Hilfe für unser GS Plugin (Nicht in der Lobby)"));
        sender.sendMessage(new TextComponent("§a/help mcmmo §e - Ansicht der mcMMO Befehle"));
        sender.sendMessage(new TextComponent("§a/help jobs §e - Befehle für die Jobs"));
        sender.sendMessage(new TextComponent("§a/help economy §e - Wie benutze ich das Geldsystem"));
        sender.sendMessage(new TextComponent("§a/help teleport §e - Hilfe für die Teleportbefehle"));
        sender.sendMessage(new TextComponent("§a/help minestorage §e - Befehle für die EXP Datenbank"));
        sender.sendMessage(new TextComponent("§a/help arenen §e - Unsere Arenen Befehle (Nur in der Lobby)"));
        sender.sendMessage(forum);
        sender.sendMessage(new TextComponent("§aTeamspeak3: §dMineGaming.de"));
        sender.sendMessage(vote);
    }

    private void cubit(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Cubit Seite 1/2) (Akania)"));
        sender.sendMessage(new TextComponent("§a/land kaufen §e - Kaufe ein freies GS"));
        sender.sendMessage(new TextComponent("§a/land verkaufen §e - Verkaufe dein GS an den Server"));
        sender.sendMessage(new TextComponent("§a/land add <Player> §e - Füge einen Freund auf dein GS hinzu"));
        sender.sendMessage(new TextComponent("§a/land remove <Player> §e - Entferne einen Freund von einem GS"));
        sender.sendMessage(new TextComponent("§a/land aufkaufen §e - Kaufe ein inaktives GS auf"));
        sender.sendMessage(new TextComponent("§a/land abkaufen §e - Kaufe ein angebotenes GS"));
        sender.sendMessage(new TextComponent("§a/land anbieten §e - Biete ein GS zum Verkauf an"));
        sender.sendMessage(new TextComponent("§e/help cubit 2 §a Weiter auf Seite 2"));
    }

    private void cubit2(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Cubit Seite 2/2) (Akania)"));
        sender.sendMessage(new TextComponent("§a/land kick §e - Nichtmember vom Land entfernen"));
        sender.sendMessage(new TextComponent("§a/land addall <Player> §e - Füge einen Freund auf alle GS hinzu"));
        sender.sendMessage(new TextComponent("§a/land removeall <Player> §e - Entferne einen Freund von allen GS"));
        sender.sendMessage(new TextComponent("§a/land help 2 §e - Zeigt Kaufen/Verkaufen Befehle"));
        sender.sendMessage(new TextComponent("§a/land help 3 §e - Zeigt Freunde verwalten Befehle"));
        sender.sendMessage(new TextComponent("§a/land help 4 §e - Zeigt Land verwalten Befehle"));
        sender.sendMessage(new TextComponent("§a/land help 5 §e - Zeigt Biom verwalten Befehle"));
        sender.sendMessage(new TextComponent("§e/help cubit §a Zurück auf Seite 1"));
    }

    private void mcmmo(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (mcMMO Seite 1/1)"));
        sender.sendMessage(new TextComponent("§a/mcstats §e - Zeigt deinen mcMMO Stats"));
        sender.sendMessage(new TextComponent("§a/mctop §e - Zeigt die mcMMO Topliste"));
        sender.sendMessage(new TextComponent("§a/<Skill> §e - Zeigt Infos über diesen Skill"));
    }

    private void jobs(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Jobs Seite 1/1)"));
        sender.sendMessage(new TextComponent("§a/jobs browse §e - Zeigt alle verfügbaren Jobs"));
        sender.sendMessage(new TextComponent("§a/jobs join <Job> §e - Tritt einen Job bei"));
        sender.sendMessage(new TextComponent("§a/jobs leave <Job> §e - Verlasse einen Job"));
        sender.sendMessage(new TextComponent("§a/jobs stats §e - Zeigt deine Stats"));
        sender.sendMessage(new TextComponent("§a/jobs info <Job> <Aktion> §e - Zeigt wievil du für etwas bekommst"));
    }

    private void economy(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Economy Seite 1/1)"));
        sender.sendMessage(new TextComponent("§a/money §e - Zeigt deinen Kontostand"));
        sender.sendMessage(new TextComponent("§a/money pay <Player> <Menge> §e - Überweist einem Spieler Mines"));
    }

    private void teleport(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Teleport Seite 1/1)"));
        sender.sendMessage(new TextComponent("§a/sethome <Homename> §e - Setzt ein Home"));
        sender.sendMessage(new TextComponent("§a/home <Homename> §e - Teleport zu einem Home"));
        sender.sendMessage(new TextComponent("§a/delhome <Homename> §e - Löschen eines Homes"));
        sender.sendMessage(new TextComponent("§a/spawn §e - Teleport zum Serverspawn"));
        sender.sendMessage(new TextComponent("§a/lobby §e - Teleport zur Netzwerk Lobby"));
        sender.sendMessage(new TextComponent("§a/w <Warp> §e - Teleport zum einem Warppunkt"));
        sender.sendMessage(new TextComponent("§a/warps §e - Liste der Warps"));
        sender.sendMessage(new TextComponent("§a/tpa §e - Teleportanfrage senden"));
        sender.sendMessage(new TextComponent("§a/tpahere §e - Teleportanfrage senden"));
        sender.sendMessage(new TextComponent("§a/tpdeny §e - Teleportanfrage ablehnen"));
        sender.sendMessage(new TextComponent("§a/tpaccept §e - Teleportanfrage annehmen"));
    }

    private void minestorage(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (MineStorage Seite 1/1)"));
        sender.sendMessage(new TextComponent("§a/ms account §e - Zeigt deine EXP Punkte"));
        sender.sendMessage(new TextComponent("§a/ms add <EXP> §e - Zahle EXP in deinen Account ein"));
        sender.sendMessage(new TextComponent("§a/ms take <EXP> §e - Zahle EXP aus deinen Account aus"));
        sender.sendMessage(new TextComponent("§a/ms pay <Player> <EXP> §e - Zahle EXP an einen anderen Spieler"));
    }

    private void arenen(CommandSender sender) {
        sender.sendMessage(new TextComponent("§e§lHilfeseite: (Arenen Seite 1/1) (Lobby)"));
        sender.sendMessage(new TextComponent("§a§lMobArena"));
        sender.sendMessage(new TextComponent("§a/ma join <Arena> §e - Betrete eine MobArena"));
        sender.sendMessage(new TextComponent("§a/ma leave  §e - Verlasse eine MobArena"));
        sender.sendMessage(new TextComponent("§a§lMineGames"));
        sender.sendMessage(new TextComponent("§a/mg join §e - Betrete die MineGames Lobby"));
        sender.sendMessage(new TextComponent("§a/mg leave §e - Verlasse eine MineGames Arena"));
        sender.sendMessage(new TextComponent("§a§lPVPArena"));
        sender.sendMessage(new TextComponent("§a/pa join §e - Betrete die PvP Arena"));
        sender.sendMessage(new TextComponent("§a/pa leave §e - Verlasse eine PvP Arena"));
    }
}
