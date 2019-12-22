package sec.project

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

interface HasLogger

inline fun <reified T : HasLogger> T.logger(): Logger = LoggerFactory.getLogger(T::class.java)
