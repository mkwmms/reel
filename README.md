# dotstrap
[![Build Status](https://travis-ci.org/mkwmms/dotstrap.svg)](https://travis-ci.org/mkwmms/dotstrap)

Downloads repositories from GitHub in parallel and symbolically links and/or 
creates a file to be sourced in your 
`~/.zshrc`, `~/.bashrc`, `~/.config/fish/config.fish` or similar 

## how it works
- fish
  - `./functions/*.fish` are symbolically linked under `~/.config/fish/functions/`
  - `./completions/*.fish` are symbolically linked under `~/.config/fish/completions/`
  - all other `*.fish` files' paths are written to: `$XDG_CONFIG_HOME/dotstrap/dotstrap.fish` 
  so you can add `source `$XDG_CONFIG_HOME/dotstrap/dotstrap.fish` to your `~/.config/fish/config.fish`
- zsh 
  - `*.{zsh,sh}` files' paths are written to: `$XDG_CONFIG_HOME/dotstrap/dotstrap.zsh` 
  so you can add `source `$XDG_CONFIG_HOME/dotstrap/dotstrap.zsh` to your `~/.zshrc`
- bash
  - `*.{bash,sh}` files' paths are written to: `$XDG_CONFIG_HOME/dotstrap/dotstrap.bash` 
  so you can add `source `$XDG_CONFIG_HOME/dotstrap/dotstrap.bash` to your `~/.bash_profile` or similar

## install 

`gem install dotstrap`

or

`git clone https://github.com/mkwmms/dotstrap.git` and then `rake install`

## usage

`ds install <github repo>`

`ds remove <github repo>`

where `<github repo>` is repository slug like 'mkwmms/dotstrap-osx'

you can also install repos from a file like:

`ds install -f FILE`

where `FILE` is a list with the same syntax as `<github repo>`, each seperated
by a new line. (lines starting with `#` are ignored)

`ds list`

run `ds --help` for a full list of commands

## roadmap

This is very much in alpha right now...

- install config files from arbiturary URLs
- list config files when running `ds list <some repo>`
- add a mechanism to define what config files to load and where to put them, possibly
through a YAML (or similar) config file at root of repo or via shell environment variables

### Copyright

Copyright (c) 2015 William Myers. See LICENSE.txt for further details.

