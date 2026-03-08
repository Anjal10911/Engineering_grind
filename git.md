git is a software and git is a version control system

github is a service provider and a website that allows developers to store and manage their code using git

version control is used to track files for changes 

git init - create a repo/ creates a .git hidden folder --> ls -la --> shows the hidden folder 

rm -rf.config - to reset git steup

git log - history

git status - check status of tracked/untracked files

git commit -m "message" - new commit

git commit -am "message" - update 

git add. - add file

git config --global user.name "Alice" - username permission or identity check

git config --global user.email "alice@gmail.com" - email check

git --version - checks version 

git config --list -- credential helpre, stores credentials like username and useremail

git clone - clones a repo on our local machine

ls -a - shows hidden files and all the files

git remote add origin <link>

git remote -v - to verify remote

git branch - to check branch

git branch -M main - to rename branch

git checkout - to check branch

git checkout -b <-new branch name-> - to create a new branch

git branch -d <-branch name-> - to delete a branch

git diff <-branch name-> - to compare commits, branches, files & more

git merge <-branch name-> - merge 2 branches

Fork - Fork is a rough copy 

STAGES:

1. git init - creates file
2. git add 
3. git commit -m
4. git status
5. git push origin main - uploads local repo content to remote repo
------------------------------------------------------------------------------------------------------------------------------------------
LINUX CMDS:

pwd - present working directory

mkdir

cd

rmdir -- remove empty directory

cd .. - go back one folder 

ls - list files

ls -la - show hidden files

rm - delete file

rm -r - delete directory

mv - move/rename files

touch - create an empty file

cp - copy files

stat - show hidden details

tree - directory structure

cat - show file content

less - scroll through file

more - view file page by page

head - first 10 lines

tail - last 10 lines

tail -f - live log monitoring

nano - simple editor

vim - advanced editor

vi -classic editor

gedit - GUI editor

chmod - change permission

chown - change owner

chgrp - change group

grep - search text

find - search files

locate - fast search

which - command location

whereis - binary+source

uname -a - system info

whoami - current user

id - userid

hostname - system name

uptime - system running time

date - current date

cal - calendar

df - disc space

du - directory size

lsblk - list disks

mount - mount disk

umount - unmount disk

bg - run process in background

fg - bring to foreground

ping - test connection

ss - socket statistics

ifconfig / ipconfig - ip address/network config

curl - send http request

wget - download files

dig - DNS lookup

nslookup - DNS query

UBUNTU/KALI: 

apt update

apt upgrade

apt install

ARCH:

pacman -S

pacman -R

sudo - run as admin

su - switch user

passwd - password

useradd - add user

env - environmental variables

clear - clear terminal 

PERMISSION NUMBERS:

Number	Meaning

7	    Read + Write + Execute

6	    Read + Write

5	    Read + Execute

4	    Read

0	    No permission

 compgen -c / ls /usr/bin - to see all installed commands on your system
------------------------------------------------------------------------------------------------------------------------------------------

.gitignore
