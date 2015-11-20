#!/bin/bash
#
# This is a wrapper script, which would call the hybris scripts
# Note: arguments you can pass are
#	start - to start the hybris as a service i.e. background process
#	stop - to stop the hybris service if running.
#	debug - to stop hybris in debug mode
#	<no_args> - to start hybris in attached tty or currently logged in user account
#
`dirname ${0}`/../hybris/bin/platform/hybrisserver.sh ${1}
