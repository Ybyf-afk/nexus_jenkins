FROM jenkins/jenkins:lts

# install jenkins plugins
COPY ./jenkins-plugins /usr/share/jenkins/plugins
RUN while read i ; \ 
		do /usr/local/bin/install-plugins.sh $i ; \
	done < /usr/share/jenkins/plugins

ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# allows to skip Jenkins setup wizard
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

# Jenkins runs all grovy files from init.groovy.d dir
# use this for creating default admin user
COPY init.groovy.d/*.groovy /usr/share/jenkins/ref/init.groovy.d/


RUN mkdir -p /usr/share/jenkins/ref/jobs/seedjob
COPY seed_job/seedjob.xml /usr/share/jenkins/ref/jobs/seedjob/config.xml


