/**
 * This script is used under Jenkins Jobs
 *      + DDSW - Release
 */

proc = ['/bin/bash', '-c', "/usr/local/bin/git config --global credential.helper store"].execute()

proc1 = ['/bin/bash', '-c', "/usr/local/bin/git pull --rebase"].execute()

proc2 = ['/bin/bash', '-c', "git describe --abbrev=0 --tags"].execute()

return proc2.text
