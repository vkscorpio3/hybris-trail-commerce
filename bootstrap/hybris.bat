REM
REM 	This is a wrapper script, which would call the hybris scripts
REM 	Note: arguments you can pass are
REM		start - to start the hybris as a service i.e. background process
REM		stop - to stop the hybris service if running.
REM		debug - to stop hybris in debug mode
REM		<no_args> - to start hybris in attached tty or currently logged in user account
REM
..\hybris\bin\platform\hybrisserver.bat %1
